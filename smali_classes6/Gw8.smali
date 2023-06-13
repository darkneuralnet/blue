.class public final synthetic LGw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc69;


# instance fields
.field public final synthetic a:Lxy8;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lxy8;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGw8;->a:Lxy8;

    iput p2, p0, LGw8;->b:I

    return-void
.end method


# virtual methods
.method public final zza()LMb9;
    .locals 2

    iget-object v0, p0, LGw8;->a:Lxy8;

    iget v1, p0, LGw8;->b:I

    invoke-virtual {v0, v1}, Lxy8;->c(I)LMb9;

    move-result-object v0

    return-object v0
.end method
