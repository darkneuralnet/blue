.class public final synthetic LAL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LJL;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LJL;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAL;->b:LJL;

    iput-object p2, p0, LAL;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LAL;->b:LJL;

    iget-object v1, p0, LAL;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LJL;->h(LJL;Ljava/lang/String;)V

    return-void
.end method
