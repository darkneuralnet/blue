.class public final Lrk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrk0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "[B>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lrk0;
    .locals 1

    invoke-static {}, Lrk0$a;->a()Lrk0;

    move-result-object v0

    return-object v0
.end method

.method public static c()[B
    .locals 1

    invoke-static {}, Lgk0$c;->k()[B

    move-result-object v0

    invoke-static {v0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method


# virtual methods
.method public b()[B
    .locals 1

    invoke-static {}, Lrk0;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrk0;->b()[B

    move-result-object v0

    return-object v0
.end method
