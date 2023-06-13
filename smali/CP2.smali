.class public final LCP2;
.super LDP2;
.source "SourceFile"


# instance fields
.field public final d:Landroid/media/session/MediaSessionManager$RemoteUserInfo;


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LDP2;-><init>(Ljava/lang/String;II)V

    invoke-static {}, LBP2;->a()V

    invoke-static {p1, p2, p3}, LAP2;->a(Ljava/lang/String;II)Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    move-result-object p1

    iput-object p1, p0, LCP2;->d:Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    return-void
.end method
