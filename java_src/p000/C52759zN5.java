package p000;

import android.content.Context;
import android.media.MediaPlayer;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m28432d2 = {"LzN5;", "", "", "b", DateTokenConverter.CONVERTER_KEY, "Landroid/media/MediaPlayer;", C17296a.f69688o, "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zN5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52759zN5 {

    /* renamed from: a */
    public MediaPlayer f121258a;

    public C52759zN5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f121258a = MediaPlayer.create(context, C37323Yk4.beep);
    }

    /* renamed from: c */
    public static final void m1477c(C52759zN5 this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f121258a == null) {
            mediaPlayer.release();
        }
    }

    /* renamed from: b */
    public final void m1478b() {
        MediaPlayer mediaPlayer = this.f121258a;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
        MediaPlayer mediaPlayer2 = this.f121258a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: yN5
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer3) {
                    C52759zN5.m1477c(C52759zN5.this, mediaPlayer3);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m1476d() {
        MediaPlayer mediaPlayer = this.f121258a;
        if (mediaPlayer != null) {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.f121258a = null;
        }
    }
}
