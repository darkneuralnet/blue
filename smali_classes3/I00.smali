.class public final LI00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI00$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LH00;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LI00;
    .locals 1

    invoke-static {}, LI00$a;->a()LI00;

    move-result-object v0

    return-object v0
.end method

.method public static c()LH00;
    .locals 1

    new-instance v0, LH00;

    invoke-direct {v0}, LH00;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LH00;
    .locals 1

    invoke-static {}, LI00;->c()LH00;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI00;->b()LH00;

    move-result-object v0

    return-object v0
.end method
