.class public final synthetic Lmu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqu0$a;


# instance fields
.field public final synthetic a:Lou0;

.field public final synthetic b:[Lo0;


# direct methods
.method public synthetic constructor <init>(Lou0;[Lo0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmu0;->a:Lou0;

    iput-object p2, p0, Lmu0;->b:[Lo0;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 2

    iget-object v0, p0, Lmu0;->a:Lou0;

    iget-object v1, p0, Lmu0;->b:[Lo0;

    invoke-static {v0, v1, p1, p2}, Lou0;->c(Lou0;[Lo0;II)V

    return-void
.end method
