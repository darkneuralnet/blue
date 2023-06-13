.class public final synthetic LTw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:Lxy8;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lxy8;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTw8;->a:Lxy8;

    iput p2, p0, LTw8;->b:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 2

    iget-object v0, p0, LTw8;->a:Lxy8;

    iget v1, p0, LTw8;->b:I

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1, p1}, Lxy8;->d(ILjava/lang/Throwable;)LMb9;

    move-result-object p1

    return-object p1
.end method
