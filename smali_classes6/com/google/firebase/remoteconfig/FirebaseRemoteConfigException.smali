.class public Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;
.super Lcom/google/firebase/FirebaseException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;
    }
.end annotation


# instance fields
.field public final b:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/FirebaseException;-><init>(Ljava/lang/String;)V

    sget-object p1, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->c:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;->b:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/FirebaseException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;->b:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/FirebaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;->c:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;->b:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/FirebaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;->b:Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException$a;

    return-void
.end method
