.class public final synthetic LiS4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:LIT4;


# direct methods
.method public synthetic constructor <init>(LIT4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiS4;->b:LIT4;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LiS4;->b:LIT4;

    invoke-static {v0, p1}, LIT4;->E1(LIT4;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
