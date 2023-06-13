.class public final synthetic LCz6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LJz6;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LJz6;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCz6;->b:LJz6;

    iput-object p2, p0, LCz6;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LCz6;->b:LJz6;

    iget-object v1, p0, LCz6;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LJz6;->e(LJz6;Ljava/lang/String;)V

    return-void
.end method
