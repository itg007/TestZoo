package sdu.cs.sirichai.testzoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//end onCreate

    public void elephant(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer.start();
    }//end elephant

    public void horse(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.horse);
        mediaPlayer.start();
    }//end horse

    public void lion(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.lion);
        mediaPlayer.start();
    }//end lion

    public void clickMap(View view) {
        Uri location = Uri.parse("https://www.google.com/maps/place/13.216298, 101.056642");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }//end clickMap

    public void clickCall(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel: 0990065815"));
        startActivity(mobileIntent);
    }//clickCall
}//end Class