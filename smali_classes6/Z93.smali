.class public final synthetic LZ93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:Lio/reactivex/c;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ93;->b:Lio/reactivex/c;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZ93;->b:Lio/reactivex/c;

    check-cast p1, Lio/reactivex/Observable;

    invoke-static {v0, p1}, Laa3;->a(Lio/reactivex/c;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
