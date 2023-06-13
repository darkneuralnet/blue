.class public LiQ5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LiQ5;


# instance fields
.field public final a:LSO1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LiQ5;

    invoke-direct {v0}, LiQ5;-><init>()V

    sput-object v0, LiQ5;->b:LiQ5;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LNE;

    invoke-direct {v0}, LNE;-><init>()V

    iput-object v0, p0, LiQ5;->a:LSO1;

    return-void
.end method

.method public static b()LiQ5;
    .locals 1

    sget-object v0, LiQ5;->b:LiQ5;

    return-object v0
.end method


# virtual methods
.method public a()LSO1;
    .locals 1

    iget-object v0, p0, LiQ5;->a:LSO1;

    return-object v0
.end method
