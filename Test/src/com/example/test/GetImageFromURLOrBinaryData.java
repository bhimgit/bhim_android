package com.example.test;


public class GetImageFromURLOrBinaryData {

	/**
	 * Get Bitmap From URL.
	 * 
	 * @param contentURL
	 * @return
	 * @throws IOException
	 */
	public Bitmap getImageFromURL(String contentURL, String protocolType)
			throws IOException {

		InputStream inputStream = null;

		URL url = new URL(contentURL);
		if (protocolType.equalsIgnoreCase("http")) {
			HttpURLConnection httpURLConnection = (HttpURLConnection) url
					.openConnection();
			inputStream = httpURLConnection.getInputStream();
		} else {
			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url
					.openConnection();
			inputStream = httpsURLConnection.getInputStream();
		}

		Bitmap bitmap = BitmapFactory.decodeStream(inputStream);

		return bitmap;
	}

	/**
	 * Get Image From Binary Data. Base64 Class is used to encode/decode binary
	 * data into byte array and vice versa.
	 * 
	 * @param binaryData
	 * @return
	 */
	public Bitmap getImageFromBinaryData(String binaryData) {
		byte[] byteArr = Base64.decode(binaryData, Base64.DEFAULT);
		Bitmap bitmap = BitmapFactory.decodeByteArray(byteArr, 0,
				byteArr.length);
		return bitmap;
	}
}
