.class public final Lba2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Laa2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lba2;
    .locals 1

    invoke-static {}, Lba2$a;->a()Lba2;

    move-result-object v0

    return-object v0
.end method

.method public static c()Laa2;
    .locals 1

    new-instance v0, Laa2;

    invoke-direct {v0}, Laa2;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Laa2;
    .locals 1

    invoke-static {}, Lba2;->c()Laa2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lba2;->b()Laa2;

    move-result-object v0

    return-object v0
.end method
