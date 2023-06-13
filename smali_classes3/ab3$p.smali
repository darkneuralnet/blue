.class public final Lab3$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lab3;->W(Lio/reactivex/c;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lob3;",
        "Lob3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lob3;",
        "state",
        "a",
        "(Lob3;)Lob3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lab3$p;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lab3$p;

    invoke-direct {v0}, Lab3$p;-><init>()V

    sput-object v0, Lab3$p;->g:Lab3$p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lob3;)Lob3;
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {p1}, Lob3;->e()I

    move-result v0

    add-int/lit8 v6, v0, -0x1

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lob3;->copy$default(Lob3;ZLjava/util/List;Lco/bird/android/model/persistence/OperatorNotificationCategory;Ljava/util/List;IILjava/lang/Object;)Lob3;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lob3;

    invoke-virtual {p0, p1}, Lab3$p;->a(Lob3;)Lob3;

    move-result-object p1

    return-object p1
.end method
