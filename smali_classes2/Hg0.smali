.class public final synthetic LHg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LGg0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LGg0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHg0;->b:Ljava/lang/String;

    iput-object p2, p0, LHg0;->c:LGg0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LHg0;->b:Ljava/lang/String;

    iget-object v1, p0, LHg0;->c:LGg0;

    invoke-static {v0, v1}, LGg0$b;->a(Ljava/lang/String;LGg0;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
