.class public final Lfc4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfc4$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lec4;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lfc4;
    .locals 1

    invoke-static {}, Lfc4$a;->a()Lfc4;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lec4;
    .locals 1

    new-instance v0, Lec4;

    invoke-direct {v0}, Lec4;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lec4;
    .locals 1

    invoke-static {}, Lfc4;->c()Lec4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfc4;->b()Lec4;

    move-result-object v0

    return-object v0
.end method
