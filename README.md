# GdriveStream
This is a simple Java class that allows you to Stream videos stored in your Google Drive directly to external video players in real time. You can also change the Intent behaviour and stream the video in a native video player instead of External Player. 

This method allows you to:
1. Switch between multiple subtitles (if available).
2. Add external subtitles.
3. Switch between multiple audio tracks (if available).
4. Maintains original media quality.

# Usage
1. Get your Google Drive API Key from https://console.developers.google.com/apis/library/drive.googleapis.com

2. Copy the GdriveStream.java class to your project.
3. Call the GdriveStream class in your activity:  
"GdriveStream gdriveStream = new GdriveStream();"

4. Initialize the function:  
"gdriveStream.stream(mediaLink, APIkey, context);"  
This function requires 3 parameters:  
i. "mediaLink" - The link of the video file stored in Google Drive.  
ii. "APIkey" - Google Drive API key acquired from Step 1.  
iii. "context" - Context of the activity.  
