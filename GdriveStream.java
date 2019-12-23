package com.princevegeta.nightowl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class Test {

    public void stream(String mediaLink, String APIkey, Context context) {

        if (mediaLink.contains("drive.google.com") || mediaLink.contains("docs.google.com")) {
            if (mediaLink.contains("/d/")) {
                String[] firstSplit = mediaLink.split("/d/");
                String firstString = firstSplit[1];
                String[] secondSplit = firstString.split("/view");
                String videoLink = "https://www.googleapis.com/drive/v3/files/" + secondSplit[0] + "?key=" + APIkey + "&alt=media";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse(videoLink), "video/*");
                context.startActivity(Intent.createChooser(intent, "Open Using"));
            } else if (mediaLink.contains("id=")) {
                String[] firstSplit = mediaLink.split("id=");
                String firstString = firstSplit[1];
                String[] secondSplit = firstString.split("&export");
                String videoLink = "https://www.googleapis.com/drive/v3/files/" + secondSplit[0] + "?key=" + APIkey + "&alt=media";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse(videoLink), "video/*");
                context.startActivity(Intent.createChooser(intent, "Open Using"));
            }
        } else if (!mediaLink.contains("drive.google.com") || !mediaLink.contains("docs.google.com")) {
            Toast.makeText(context, "Only GDrive links are supported!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "Unexpected error", Toast.LENGTH_LONG).show();
        }
    }

}
