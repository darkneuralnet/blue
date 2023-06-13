.class public final synthetic LJG3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/q;


# instance fields
.field public final synthetic b:LgH3;


# direct methods
.method public synthetic constructor <init>(LgH3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJG3;->b:LgH3;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LJG3;->b:LgH3;

    invoke-static {v0, p1}, LgH3;->e(LgH3;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
