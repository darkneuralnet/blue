.class public final LE21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE21$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LD21;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LE21;
    .locals 1

    invoke-static {}, LE21$a;->a()LE21;

    move-result-object v0

    return-object v0
.end method

.method public static c()LD21;
    .locals 1

    new-instance v0, LD21;

    invoke-direct {v0}, LD21;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LD21;
    .locals 1

    invoke-static {}, LE21;->c()LD21;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE21;->b()LD21;

    move-result-object v0

    return-object v0
.end method
