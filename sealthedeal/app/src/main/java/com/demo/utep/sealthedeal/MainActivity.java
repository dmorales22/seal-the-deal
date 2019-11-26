package com.demo.utep.sealthedeal;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final int pic_id = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void goToProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void goToResume(View view) {

        Intent myIntent = new Intent();
        myIntent.setClassName(this, "com.google.android.gms.samples.vision.ocrreader");
        startActivity(myIntent);



    }

    public void goToVirtual(View view) {
        Intent intent = new Intent(this, VRActivity.class);
        startActivity(intent);
    }

    public void goToResources(View view) {
        Intent intent = new Intent(this, TipsActivity.class);
        startActivity(intent);
    }

    public void goToReports(View view) {
        Intent intent = new Intent(this, ReportActivity.class);
        startActivity(intent);
    }
    /*
    private void runTextRecognition() {
        //FirebaseVisionImage image = FirebaseVisionImage.fromBitmap(mSelectedImage);
        FirebaseVisionTextRecognizer recognizer = FirebaseVision.getInstance()
                .getOnDeviceTextRecognizer();
        //mTextButton.setEnabled(false);
        recognizer.processImage(image)
                .addOnSuccessListener(
                        new OnSuccessListener<FirebaseVisionText>() {
                            private AutomaticZenRule mTextButton;

                            @Override
                            public void onSuccess(FirebaseVisionText texts) {
                               // mTextButton.setEnabled(true);
                                processTextRecognitionResult(texts);
                            }
                        })
                .addOnFailureListener(
                        new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                // Task failed with an exception
                                //mTextButton.setEnabled(true);
                                e.printStackTrace();
                            }
                        });
    }

    private void processTextRecognitionResult(FirebaseVisionText texts) {
    }*/
    /** A safe way to get an instance of the Camera object. */
    public static Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }
}
