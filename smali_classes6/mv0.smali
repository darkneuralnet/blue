.class public final synthetic Lmv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/common/util/BiConsumer;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/firebase/remoteconfig/internal/b;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/common/util/BiConsumer;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmv0;->b:Lcom/google/android/gms/common/util/BiConsumer;

    iput-object p2, p0, Lmv0;->c:Ljava/lang/String;

    iput-object p3, p0, Lmv0;->d:Lcom/google/firebase/remoteconfig/internal/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lmv0;->b:Lcom/google/android/gms/common/util/BiConsumer;

    iget-object v1, p0, Lmv0;->c:Ljava/lang/String;

    iget-object v2, p0, Lmv0;->d:Lcom/google/firebase/remoteconfig/internal/b;

    invoke-static {v0, v1, v2}, Lnv0;->a(Lcom/google/android/gms/common/util/BiConsumer;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/b;)V

    return-void
.end method
