.class public final synthetic LU6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LT6;


# direct methods
.method public synthetic constructor <init>(LT6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU6;->b:LT6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LU6;->b:LT6;

    invoke-static {v0}, LT6$f;->a(LT6;)V

    return-void
.end method
