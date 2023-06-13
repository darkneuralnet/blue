.class public final synthetic LvU4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LxU4;


# direct methods
.method public synthetic constructor <init>(LxU4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvU4;->b:LxU4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LvU4;->b:LxU4;

    invoke-static {v0}, LxU4$a;->b(LxU4;)V

    return-void
.end method
