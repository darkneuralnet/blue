.class public final synthetic LgH1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:LiH1;


# direct methods
.method public synthetic constructor <init>(LiH1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgH1;->b:LiH1;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LgH1;->b:LiH1;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LiH1$a;->a(LiH1;Ljava/lang/Throwable;)LHM4;

    move-result-object p1

    return-object p1
.end method
