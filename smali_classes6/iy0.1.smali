.class public final Liy0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liy0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Liy0;
    .locals 1

    invoke-static {}, Liy0$a;->a()Liy0;

    move-result-object v0

    return-object v0
.end method

.method public static b()I
    .locals 1

    invoke-static {}, Lhy0;->a()I

    move-result v0

    return v0
.end method


# virtual methods
.method public c()Ljava/lang/Integer;
    .locals 1

    invoke-static {}, Liy0;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Liy0;->c()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method