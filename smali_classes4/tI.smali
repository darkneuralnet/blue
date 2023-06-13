.class public final synthetic LtI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LOI;

.field public final synthetic c:LXn1;


# direct methods
.method public synthetic constructor <init>(LOI;LXn1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtI;->b:LOI;

    iput-object p2, p0, LtI;->c:LXn1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LtI;->b:LOI;

    iget-object v1, p0, LtI;->c:LXn1;

    invoke-static {v0, v1}, LOI;->r(LOI;LXn1;)V

    return-void
.end method
