.class public final synthetic Lyr1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/c;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyr1;->a:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyr1;->a:Lkotlin/jvm/functions/Function2;

    invoke-static {v0, p1, p2}, Lzr1;->a5(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lco/bird/android/model/constant/FleetReportPage;

    move-result-object p1

    return-object p1
.end method
