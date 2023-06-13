.class public Lcom/google/firebase/remoteconfig/internal/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEv0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/remoteconfig/internal/e;->A(Ljava/net/HttpURLConnection;)Lcom/google/firebase/remoteconfig/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/e;


# direct methods
.method public constructor <init>(Lcom/google/firebase/remoteconfig/internal/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/e$b;->a:Lcom/google/firebase/remoteconfig/internal/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LDv0;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e$b;->a:Lcom/google/firebase/remoteconfig/internal/e;

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/internal/e;->b(Lcom/google/firebase/remoteconfig/internal/e;)V

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e$b;->a:Lcom/google/firebase/remoteconfig/internal/e;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->c(Lcom/google/firebase/remoteconfig/internal/e;Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;)V

    return-void
.end method
