.class public final synthetic LR93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:Lio/reactivex/subjects/d;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/subjects/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR93;->b:Lio/reactivex/subjects/d;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LR93;->b:Lio/reactivex/subjects/d;

    check-cast p1, Lio/reactivex/Observable;

    invoke-static {v0, p1}, Laa3;->h(Lio/reactivex/subjects/d;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
