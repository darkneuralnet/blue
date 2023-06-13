.class public final Lly0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lly0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lei0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lly0;
    .locals 1

    invoke-static {}, Lly0$a;->a()Lly0;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lei0;
    .locals 1

    invoke-static {}, Lhy0;->d()Lei0;

    move-result-object v0

    invoke-static {v0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lei0;

    return-object v0
.end method


# virtual methods
.method public b()Lei0;
    .locals 1

    invoke-static {}, Lly0;->c()Lei0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lly0;->b()Lei0;

    move-result-object v0

    return-object v0
.end method
