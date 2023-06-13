.class public final LTH$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTH$b;->b(Ljava/lang/Boolean;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LT24;",
        "Lco/bird/android/model/BirdActionsAndSettings;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LT24;",
        "it",
        "Lco/bird/android/model/BirdActionsAndSettings;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LT24;)Lco/bird/android/model/BirdActionsAndSettings;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LTH$b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LTH$b$a;

    invoke-direct {v0}, LTH$b$a;-><init>()V

    sput-object v0, LTH$b$a;->g:LTH$b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT24;)Lco/bird/android/model/BirdActionsAndSettings;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/BirdActionsAndSettings;

    invoke-virtual {p1}, LT24;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, LT24;->c()Lco/bird/android/model/PrivateBirdSetting;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lco/bird/android/model/BirdActionsAndSettings;-><init>(Ljava/util/List;Lco/bird/android/model/PrivateBirdSetting;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT24;

    invoke-virtual {p0, p1}, LTH$b$a;->a(LT24;)Lco/bird/android/model/BirdActionsAndSettings;

    move-result-object p1

    return-object p1
.end method
