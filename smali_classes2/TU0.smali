.class public final synthetic LTU0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/g;


# instance fields
.field public final synthetic b:LWU0;


# direct methods
.method public synthetic constructor <init>(LWU0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTU0;->b:LWU0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LTU0;->b:LWU0;

    check-cast p1, Lkotlin/Triple;

    invoke-static {v0, p1}, LWU0;->c(LWU0;Lkotlin/Triple;)V

    return-void
.end method
