.class interface abstract Lzendesk/core/UserService;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addTags(Lzendesk/core/UserTagRequest;)Lx80;
    .param p1    # Lzendesk/core/UserTagRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/mobile/user_tags.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/core/UserTagRequest;",
            ")",
            "Lx80<",
            "Lzendesk/core/UserResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract deleteTags(Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "tags"
        .end annotation
    .end param
    .annotation runtime LKF0;
        value = "/api/mobile/user_tags/destroy_many.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Lzendesk/core/UserResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getUser()Lx80;
    .annotation runtime LNA1;
        value = "/api/mobile/users/me.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx80<",
            "Lzendesk/core/UserResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getUserFields()Lx80;
    .annotation runtime LNA1;
        value = "/api/mobile/user_fields.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx80<",
            "Lzendesk/core/UserFieldResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract setUserFields(Lzendesk/core/UserFieldRequest;)Lx80;
    .param p1    # Lzendesk/core/UserFieldRequest;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "/api/mobile/users/me.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/core/UserFieldRequest;",
            ")",
            "Lx80<",
            "Lzendesk/core/UserResponse;",
            ">;"
        }
    .end annotation
.end method
