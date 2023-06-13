.class public final synthetic LIZ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Li25;


# direct methods
.method public synthetic constructor <init>(ZLi25;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LIZ4;->b:Z

    iput-object p2, p0, LIZ4;->c:Li25;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, LIZ4;->b:Z

    iget-object v1, p0, LIZ4;->c:Li25;

    invoke-static {v0, v1}, Li25;->G0(ZLi25;)V

    return-void
.end method
