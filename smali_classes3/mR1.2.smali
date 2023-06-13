.class public final synthetic LmR1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/q;


# instance fields
.field public final synthetic b:LcR1;


# direct methods
.method public synthetic constructor <init>(LcR1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmR1;->b:LcR1;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LmR1;->b:LcR1;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LcR1$l;->c(LcR1;Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
