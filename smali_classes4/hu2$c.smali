.class public final Lhu2$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhu2;-><init>(Landroid/content/Context;Landroid/content/Intent;Lsu2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/AssetTask;",
        "Lco/bird/android/model/AssetTask;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/AssetTask;",
        "o1",
        "o2",
        "",
        "a",
        "(Lco/bird/android/model/AssetTask;Lco/bird/android/model/AssetTask;)Ljava/lang/Integer;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lhu2$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhu2$c;

    invoke-direct {v0}, Lhu2$c;-><init>()V

    sput-object v0, Lhu2$c;->g:Lhu2$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/AssetTask;Lco/bird/android/model/AssetTask;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "o1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "o2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/AssetTask;->getPriority()Lco/bird/android/model/constant/TaskPriority;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/constant/TaskPriority;->getLevel()I

    move-result p1

    invoke-virtual {p2}, Lco/bird/android/model/AssetTask;->getPriority()Lco/bird/android/model/constant/TaskPriority;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/constant/TaskPriority;->getLevel()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/AssetTask;

    check-cast p2, Lco/bird/android/model/AssetTask;

    invoke-virtual {p0, p1, p2}, Lhu2$c;->a(Lco/bird/android/model/AssetTask;Lco/bird/android/model/AssetTask;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
