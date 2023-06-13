.class public final synthetic LD73;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:LE73;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;LE73;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD73;->b:Ljava/lang/Throwable;

    iput-object p2, p0, LD73;->c:LE73;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LD73;->b:Ljava/lang/Throwable;

    iget-object v1, p0, LD73;->c:LE73;

    invoke-static {v0, v1}, LE73;->a(Ljava/lang/Throwable;LE73;)V

    return-void
.end method
