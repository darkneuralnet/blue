.class public abstract Li32;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Li32;
    .locals 1

    new-instance v0, Li32$a;

    invoke-direct {v0}, Li32$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lh32;
.end method

.method public final b(Ljava/lang/String;)Lh32;
    .locals 1

    invoke-virtual {p0, p1}, Li32;->a(Ljava/lang/String;)Lh32;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lh32;->a(Ljava/lang/String;)Lh32;

    move-result-object v0

    :cond_0
    return-object v0
.end method
