.class public final synthetic LHD2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRD2$b;


# instance fields
.field public final synthetic a:LRD2;

.field public final synthetic b:LBk2;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:LgE2;


# direct methods
.method public synthetic constructor <init>(LRD2;LBk2;Ljava/lang/Object;LgE2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHD2;->a:LRD2;

    iput-object p2, p0, LHD2;->b:LBk2;

    iput-object p3, p0, LHD2;->c:Ljava/lang/Object;

    iput-object p4, p0, LHD2;->d:LgE2;

    return-void
.end method


# virtual methods
.method public final a(LrD2;)V
    .locals 4

    iget-object v0, p0, LHD2;->a:LRD2;

    iget-object v1, p0, LHD2;->b:LBk2;

    iget-object v2, p0, LHD2;->c:Ljava/lang/Object;

    iget-object v3, p0, LHD2;->d:LgE2;

    invoke-static {v0, v1, v2, v3, p1}, LRD2;->l(LRD2;LBk2;Ljava/lang/Object;LgE2;LrD2;)V

    return-void
.end method
