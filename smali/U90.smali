.class public final synthetic LU90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LP90$c;

.field public final synthetic b:Landroidx/camera/core/impl/d$a;


# direct methods
.method public synthetic constructor <init>(LP90$c;Landroidx/camera/core/impl/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU90;->a:LP90$c;

    iput-object p2, p0, LU90;->b:Landroidx/camera/core/impl/d$a;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LU90;->a:LP90$c;

    iget-object v1, p0, LU90;->b:Landroidx/camera/core/impl/d$a;

    invoke-static {v0, v1, p1}, LP90$c;->a(LP90$c;Landroidx/camera/core/impl/d$a;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
