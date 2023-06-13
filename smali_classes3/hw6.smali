.class public final synthetic Lhw6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhw6;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lhw6;->a:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/google/ar/core/VpsAvailability;

    invoke-static {v0, p1}, Lco/bird/android/feature/ar/view/VpsView;->H0(Lkotlin/jvm/functions/Function1;Lcom/google/ar/core/VpsAvailability;)V

    return-void
.end method
