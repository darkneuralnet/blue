.class public final Lr31$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll51;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr31$b$a;->invoke(Lm51;)Ll51;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "r31$b$a$a",
        "Ll51;",
        "",
        "dispose",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lx31;

.field public final synthetic b:LAY2;


# direct methods
.method public constructor <init>(Lx31;LAY2;)V
    .locals 0

    iput-object p1, p0, Lr31$b$a$a;->a:Lx31;

    iput-object p2, p0, Lr31$b$a$a;->b:LAY2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lr31$b$a$a;->a:Lx31;

    iget-object v1, p0, Lr31$b$a$a;->b:LAY2;

    invoke-virtual {v0, v1}, Lx31;->o(LAY2;)V

    return-void
.end method
