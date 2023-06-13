package com.google.p034ar.core;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.annotations.UsedByReflection;
import com.google.p034ar.core.exceptions.FatalException;
import com.google.p034ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p034ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.concurrent.atomic.AtomicReference;
@TargetApi(24)
@UsedByReflection("AndroidManifest.xml")
/* renamed from: com.google.ar.core.InstallActivity */
/* loaded from: classes6.dex */
public class InstallActivity extends Activity {
    private static final int BOX_SIZE_DP = 280;
    private static final int INSTALLING_TEXT_BOTTOM_MARGIN_DP = 30;
    static final String INSTALL_BEHAVIOR_KEY = "behavior";
    static final String MESSAGE_TYPE_KEY = "message";
    private static final String TAG = "ARCore-InstallActivity";
    private boolean finished;
    private ArCoreApk.InstallBehavior installBehavior;
    private boolean installStarted;
    private ArCoreApk.UserMessageType messageType;
    private boolean waitingForCompletion;
    private final ContextThemeWrapper themeWrapper = new ContextThemeWrapper(this, 16974394);
    private EnumC18012t lastEvent = EnumC18012t.CANCELLED;

    /* JADX INFO: Access modifiers changed from: private */
    public void animateToSpinner() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = getWindow().getDecorView().getWidth();
        int height = getWindow().getDecorView().getHeight();
        setContentView(new RelativeLayout(this));
        int i = (int) (displayMetrics.density * 280.0f);
        getWindow().getDecorView().setMinimumWidth(i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C18009q(this, width, i, height));
        ofFloat.addListener(new C18010r(this));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeInstaller() {
        startActivity(new Intent(this, InstallActivity.class).setFlags(67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishWithFailure(Exception exc) {
        C18002j.m48414a().f73803a = exc;
        C18002j.m48414a().m48411d();
        this.finished = true;
        super.finish();
    }

    private boolean isOptional() {
        return this.installBehavior == ArCoreApk.InstallBehavior.OPTIONAL;
    }

    private void showEducationDialog() {
        setContentView(C17970R.C17972layout.__arcore_education);
        int i = C17970R.C17971id.__arcore_cancelButton;
        findViewById(i).setOnClickListener(new View$OnClickListenerC18008p(this, 1));
        if (!isOptional()) {
            findViewById(i).setVisibility(8);
        }
        findViewById(C17970R.C17971id.__arcore_continueButton).setOnClickListener(new View$OnClickListenerC18008p(this, 0));
        TextView textView = (TextView) findViewById(C17970R.C17971id.__arcore_messageText);
        EnumC18012t enumC18012t = EnumC18012t.ACCEPTED;
        ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        if (this.messageType.ordinal() != 1) {
            textView.setText(C17970R.string.__arcore_install_app);
        } else {
            textView.setText(C17970R.string.__arcore_install_feature);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSpinner() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i, i);
        RelativeLayout relativeLayout = new RelativeLayout(this.themeWrapper);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.themeWrapper);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.themeWrapper);
        textView.setText(C17970R.string.__arcore_installing);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInstaller() {
        this.installStarted = true;
        this.lastEvent = EnumC18012t.CANCELLED;
        C18002j.m48414a().m48413b(this).m48397d(this, new C18011s(this));
    }

    @Override // android.app.Activity
    public void finish() {
        finishWithFailure(new UnavailableUserDeclinedInstallationException());
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.i(TAG, "activityResult: " + i2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (bundle != null) {
                finishWithFailure(new FatalException("Install activity was suspended and recreated."));
                return;
            }
            this.messageType = (ArCoreApk.UserMessageType) getIntent().getSerializableExtra(MESSAGE_TYPE_KEY);
            ArCoreApk.InstallBehavior installBehavior = (ArCoreApk.InstallBehavior) getIntent().getSerializableExtra(INSTALL_BEHAVIOR_KEY);
            this.installBehavior = installBehavior;
            if (this.messageType != null && installBehavior != null) {
                setTheme(16974394);
                getWindow().requestFeature(1);
                setFinishOnTouchOutside(isOptional());
                if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                    showSpinner();
                    return;
                }
                AtomicReference atomicReference = new AtomicReference(ArCoreApk.Availability.UNKNOWN_CHECKING);
                C18002j.m48414a().m48413b(this).m48399b(this, new C18007o(atomicReference));
                EnumC18012t enumC18012t = EnumC18012t.ACCEPTED;
                int ordinal = ((ArCoreApk.Availability) atomicReference.get()).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 3) {
                        finishWithFailure(new UnavailableDeviceNotCompatibleException());
                        return;
                    }
                } else {
                    Log.w(TAG, "Preliminary compatibility check failed.");
                }
                showEducationDialog();
                return;
            }
            Log.e(TAG, "missing intent data.");
            finishWithFailure(new FatalException("Install activity launched without config data."));
        } catch (RuntimeException e) {
            finishWithFailure(new FatalException("Exception starting install flow", e));
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (!this.finished) {
            C18002j.m48414a().m48411d();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.installStarted) {
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                startInstaller();
            }
        } else if (!this.finished) {
            synchronized (this) {
                EnumC18012t enumC18012t = this.lastEvent;
                if (enumC18012t == EnumC18012t.CANCELLED) {
                    finish();
                } else if (enumC18012t == EnumC18012t.ACCEPTED) {
                    this.waitingForCompletion = true;
                } else {
                    finishWithFailure(C18002j.m48414a().f73803a);
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }
}
