.class public final synthetic LGD2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRD2$b;


# instance fields
.field public final synthetic a:LRD2;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LRD2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGD2;->a:LRD2;

    iput-object p2, p0, LGD2;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(LrD2;)V
    .locals 2

    iget-object v0, p0, LGD2;->a:LRD2;

    iget-object v1, p0, LGD2;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, LRD2;->o(LRD2;Ljava/lang/String;LrD2;)V

    return-void
.end method
