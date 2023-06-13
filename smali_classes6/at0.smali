.class public final synthetic Lat0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX94;


# instance fields
.field public final synthetic a:Let0;

.field public final synthetic b:LEs0;


# direct methods
.method public synthetic constructor <init>(Let0;LEs0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lat0;->a:Let0;

    iput-object p2, p0, Lat0;->b:LEs0;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lat0;->a:Let0;

    iget-object v1, p0, Lat0;->b:LEs0;

    invoke-static {v0, v1}, Let0;->i(Let0;LEs0;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
