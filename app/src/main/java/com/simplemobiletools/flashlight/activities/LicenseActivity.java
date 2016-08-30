package com.simplemobiletools.flashlight.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.simplemobiletools.flashlight.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LicenseActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.license_butterknife_title)
    public void butterKnifeClicked() {
        openUrl(R.string.butterknife_url);
    }

    @OnClick(R.id.license_ambilwarna_title)
    public void ambilwarnaClicked() {
        openUrl(R.string.ambilwarna_url);
    }

    @OnClick(R.id.license_otto_title)
    public void ottoClicked() {
        openUrl(R.string.otto_url);
    }

    private void openUrl(int id) {
        final String url = getResources().getString(id);
        final Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
}
