.class public final synthetic Lmh5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# instance fields
.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmh5;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/y;)V
    .locals 1

    iget-object v0, p0, Lmh5;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lnh5;->d(Lkotlin/jvm/functions/Function1;Lio/reactivex/y;)V

    return-void
.end method
