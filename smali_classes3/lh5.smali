.class public final synthetic Llh5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/J;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llh5;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/H;)V
    .locals 1

    iget-object v0, p0, Llh5;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lnh5;->a(Lkotlin/jvm/functions/Function1;Lio/reactivex/H;)V

    return-void
.end method
