.class public final LU42$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU42;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final b:Lcom/android/installreferrer/api/InstallReferrerStateListener;

.field public final synthetic c:LU42;


# direct methods
.method public constructor <init>(LU42;Lcom/android/installreferrer/api/InstallReferrerStateListener;)V
    .locals 0
    .param p1    # LU42;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, LU42$b;->c:LU42;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    iput-object p2, p0, LU42$b;->b:Lcom/android/installreferrer/api/InstallReferrerStateListener;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Please specify a listener to know when setup is done."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(LU42;Lcom/android/installreferrer/api/InstallReferrerStateListener;LU42$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LU42$b;-><init>(LU42;Lcom/android/installreferrer/api/InstallReferrerStateListener;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const-string p1, "InstallReferrerClient"

    const-string v0, "Install Referrer service connected."

    invoke-static {p1, v0}, LV42;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LU42$b;->c:LU42;

    invoke-static {p2}, LsO1$a;->c5(Landroid/os/IBinder;)LsO1;

    move-result-object p2

    invoke-static {p1, p2}, LU42;->d(LU42;LsO1;)LsO1;

    iget-object p1, p0, LU42$b;->c:LU42;

    const/4 p2, 0x2

    invoke-static {p1, p2}, LU42;->e(LU42;I)I

    iget-object p1, p0, LU42$b;->b:Lcom/android/installreferrer/api/InstallReferrerStateListener;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lcom/android/installreferrer/api/InstallReferrerStateListener;->a(I)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "InstallReferrerClient"

    const-string v0, "Install Referrer service disconnected."

    invoke-static {p1, v0}, LV42;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LU42$b;->c:LU42;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LU42;->d(LU42;LsO1;)LsO1;

    iget-object p1, p0, LU42$b;->c:LU42;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LU42;->e(LU42;I)I

    iget-object p1, p0, LU42$b;->b:Lcom/android/installreferrer/api/InstallReferrerStateListener;

    invoke-interface {p1}, Lcom/android/installreferrer/api/InstallReferrerStateListener;->b()V

    return-void
.end method
