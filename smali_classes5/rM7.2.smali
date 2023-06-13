.class public final LrM7;
.super LyF7;
.source "SourceFile"


# instance fields
.field public final synthetic a:LIM7;


# direct methods
.method public constructor <init>(LIM7;)V
    .locals 0

    iput-object p1, p0, LrM7;->a:LIM7;

    invoke-direct {p0}, LyF7;-><init>()V

    return-void
.end method


# virtual methods
.method public final d2(Lcom/google/android/gms/auth/api/proxy/ProxyResponse;)V
    .locals 2

    iget-object v0, p0, LrM7;->a:LIM7;

    new-instance v1, LUN7;

    invoke-direct {v1, p1}, LUN7;-><init>(Lcom/google/android/gms/auth/api/proxy/ProxyResponse;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
