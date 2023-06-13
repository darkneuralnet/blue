.class public final LUn1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li66;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "LUn1;",
        "Li66;",
        "",
        "name",
        "Lb66;",
        "a",
        "Lxn1;",
        "Lxn1;",
        "firebasePerformance",
        "<init>",
        "(Lxn1;)V",
        "co.bird.android.lib.performance"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lxn1;


# direct methods
.method public constructor <init>(Lxn1;)V
    .locals 1

    const-string v0, "firebasePerformance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUn1;->a:Lxn1;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lb66;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LTn1;

    iget-object v1, p0, LUn1;->a:Lxn1;

    invoke-virtual {v1, p1}, Lxn1;->e(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;

    move-result-object p1

    const-string v1, "firebasePerformance.newTrace(name)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LTn1;-><init>(Lcom/google/firebase/perf/metrics/Trace;)V

    return-object v0
.end method
